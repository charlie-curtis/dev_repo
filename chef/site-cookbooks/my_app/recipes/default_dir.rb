directory "/var/www/my_app" do
  owner "www-data"
  group "www-data"
  mode 00544
  action :create
end
