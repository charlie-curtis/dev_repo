#!/usr/bin/python

import sys


def hashFile(file):
     f = open( "dictionary.txt", 'r')
     for line in f:
	  print hashLine(line)

def hashLine(line):
     
     
     


if( len(sys.argv) < 2):
     arg1 = "dictionary_hash.txt"
else:
     arg1 = sys.argv[1] 
print "The resulting file will be saved to " + arg1

hashFile(arg1)
