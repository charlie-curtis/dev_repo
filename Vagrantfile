Vagrant.configure(2) do |config|
  
  config.vm.box = "ubuntu/trusty64"
  config.vm.provision :shell, path: "bootstrap.sh"
  #config.vm.network :forwarded_port, guest:80, host:4567
  
  config.omnibus.chef_version = "12.8.1"
  config.vm.provision "chef_solo" do |chef|
    chef.cookbooks_path = [ "./chef/cookbooks", "./chef/site-cookbooks" ]
    chef.provisioning_path = "/tmp/vagrant-chef"
    chef.add_recipe "helloworld"
    chef.add_recipe "java"
    chef.add_recipe "apache2"
    #chef.add_recipe "mysql"
  end

  #sync the vagrant folder for now so I can test chef code manually	
  config.vm.synced_folder "./chef", "/home/vagrant/chef", disabled: false, type: 'rsync'
  config.gatling.rsync_on_startup = false 
end
