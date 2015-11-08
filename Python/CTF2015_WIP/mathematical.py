import socket
#setup server
TCP_IP = '54.191.53.226'
TCP_PORT = 11000
s = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
s.connect((TCP_IP, TCP_PORT))


MIN_NUMBER = 0
MAX_NUMBER = 4294967295
guess = MAX_NUMBER / 2
response = s.recv(4096);
print "Received: ", response
response = s.recv(4096);
print "Received: ", response
'''
def adjustGuess(response, guess):
	global MAX_NUMBER
	global MIN_NUMBER
	if (response == "Higher"):
		returnMe = guess + (MAX_NUMBER - guess)/2
		MIN_NUMBER = guess+1
		return returnMe
	else:
		returnMe =  guess - (guess - MIN_NUMBER)/2
		MAX_NUMBER = guess-1
		return returnMe

while (response == "Higher") or (response == "Lower"):
	s.send(str(guess))
	response = s.recv(4096);
	print "Sent: ", guess
	guess =	adjustGuess(response, guess)
'''
s.close();
