include_recipe 'apache2::default'

web_app "my_apache2" do
  template 'localhost.conf.erb'
end
