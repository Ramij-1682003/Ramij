from flask import Flask, request, render_template,jsonify
import math
app = Flask(__name__)

@app.route('/', methods=['GET', 'POST'])
def home():
    return render_template('index.html')

@app.route('/postman', methods=['POST'])
def calculate():
    if(request.method=='POST'):           #check the type of method
        ops=request.json['operation']     #take the input of what operation is performed
        num1=int(request.json['num1'])    # take the input of first number      
        num2=int(request.json['num2'])    # take the input of second number
    
    if ops == 'add':
        r = num1 + num2
        result = "The result of addition is: " + str(r)         #take the result of addition as a string
    

    
    elif ops == 'substract':
        if num2 > num1:
            r = num2 - num1
        else:
            r = num1 - num2
        result = "The result of subtraction is: " + str(r)
      

    
    elif ops == 'multiply':
        r = num1 * num2
        result = "The result of multiplication is: " + str(r)
   

    
    elif ops == 'divide':
        if num2 == 0:
            result = "Division by zero is not allowed."
        else:
            r = num1 / num2
            result = "The result of division is: " + str(r)
       
    
    elif ops=='log':
        if num1 <= 0 or num2 <= 0:
            result = "Logarithm of non-positive numbers is not defined."
        else:
            r = math.log(num1, num2)
            result = "The logarithm is: " + str(r)
    
    return jsonify (result)

if __name__ == '__main__':
    app.run(host="0.0.0.0")
