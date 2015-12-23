#!/usr/bin/python

import sys


def hash(file):
     print "I received " + file



if( len(sys.argv) < 2):
     arg1 = "dictionary_hash.txt"
else:
     arg1 = sys.argv[1] 
print "The resulting file will be saved to " + arg1

hash(arg1)
