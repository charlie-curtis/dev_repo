include_recipe 'my_app::my_mysql'
include_recipe 'apache2::default'
include_recipe 'my_app::my_apache2'
include_recipe 'my_app::default_dir' #create directory after apache sets up users
