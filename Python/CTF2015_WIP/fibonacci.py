import re
import socket

#setup server
TCP_IP = '54.191.53.226'
TCP_PORT = 10100
s = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
s.connect((TCP_IP, TCP_PORT))

response = s.recv(4096);
print "Received: ", response

##############################
def parseNumber(str):
	m  = re.search('\d+', str)
	 
	return m.group(0);
##############################


# These values never get reset (convenient caching)
result = 0;
firstNum = 0;
secondNum = 1;
i = 1
dict = {"high_val" : 0, "high_index": 0 };
memo = {};

def computeFib(num):
	if (dict['high_val'] < num):
		while secondNum != num:
			global i, cache, result, firstNum, secondNum
			i = i +1
			result = firstNum + secondNum
			firstNum = secondNum
			secondNum = result
			memo[i] = result;
		dict['high_val'] = result	
		dict['high_index'] = i
	return memo[i];	


#take input
inputNum = 0
maxNum = 100
while inputNum <= 100:
	print "Iteration: ", inputNum
	response = s.recv(4096);
	val = parseNumber(response);
	answer = computeFib(val);
	print "Sending: ", answer
	s.send(answer);
 
s.close();
