Vagrant.configure(2) do |config|
  
  config.vm.box = "ubuntu/trusty64"
  config.vm.network :forwarded_port, guest:80, host:8080
  config.omnibus.chef_version = "12.8.1"

  config.vm.provision "shell", inline: "sudo apt-get update; sudo apt-get install python3-pip; sudo pip install Flask"
  config.vm.provision "chef_solo" do |chef|
    chef.cookbooks_path = [ "./chef/cookbooks", "./chef/site-cookbooks" ]
    chef.provisioning_path = "/tmp/vagrant-chef"
    chef.add_recipe "my_app"
  end
  

  config.vm.synced_folder "./app", "/var/www/my_app", disabled: false, type: 'rsync'
  config.gatling.rsync_on_startup = false 
end
