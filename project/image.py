import requests
from bs4 import BeautifulSoup as bs
from urllib.request import urlopen
import logging
import pymongo
import os
save_directory = "images"
headers = {
    "User-Agent": "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/58.0.3029.110 Safari/537.3"
}
query = input("Enter the search query: ") 
response=requests.get(f"https://www.google.com/search?q=+{query}&sca_esv=fd80f86e9ec25f50&udm=2&biw=1536&bih=695&sxsrf=AE3TifMDVU00XUipjKKlc4eHsDz57h-OAw%3A1753970664127&ei=6HeLaMvJB--hnesPvqvH0A8&ved=0ahUKEwjL3YbzoeeOAxXvUGcHHb7VEfoQ4dUDCBE&uact=5&oq=sudhansu+kumar+&gs_lp=EgNpbWciD3N1ZGhhbnN1IGt1bWFyIDIHECMYJxjJAjIFEAAYgAQyBRAAGIAEMgYQABgKGB4yBBAAGB4yBBAAGB4yBBAAGB4yBBAAGB4yBBAAGB4yBhAAGAoYHkjjCVCGA1jTBHABeACQAQCYAbkBoAHeAqoBAzAuMrgBA8gBAPgBAZgCA6AC6gLCAgYQABgFGB6YAwCIBgGSBwMxLjKgB8wKsgcDMC4yuAfnAsIHBTAuMS4yyAcK&sclient=img")
soup=bs(response.content) # Parse the HTML content
images_tag=soup.find_all("img")  # Find all image tags
# len(images_tag)
del images_tag[0]
images_tag
image_data_mongo=[]
for i in images_tag:
    image_url=i["src"]
    image_data=requests.get(image_url).content
    dict={"index":image_url, "data":image_data}
    image_data_mongo.append(dict)
    with open(os.path.join(save_directory, f"{query}_{images_tag.index(i)}.jpg"),"wb") as f:
        f.write(image_data)
# client = pymongo.MongoClient("mongodb+srv://ramijikbal:ramijikbal@cluster0.0vg4wht.mongodb.net/college?retryWrites=true&w=majority")
# db = client["college"]
# collection = db["images"]
# collection.insert_many(image_data_mongo)  # Insert the image data into MongoDB
    

