from flask import Flask
from flask import request

app= Flask(__name__)

@app.route('/n')
def hello_world():
    return "<h1>"'Hello, World!'"<h1>"

@app.route('/name')
def name():
    return "ramij"

@app.route('/name2')
def name2():
    return "ramij2"

@app.route('/r')
def show():   
    b= request.args.get('a')
    return "The value of a is: {}".format(b) 



if __name__ == '__main__':
    app.run(host="0.0.0.0")