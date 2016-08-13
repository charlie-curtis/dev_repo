from flask import Flask
app = Flask(__name__)

@app.route('/')
def hello_world():
    return 'Hello, World!jajaj'

@app.route('/test/')
def hello_world1():
    return '/asdfasdfatest/ url bro'
