#!/bin/bash

#install chef & then use it to provision everything else
curl -L https://www.opscode.com/chef/install.sh | sudo bash -s -- -v 12.12.15 
