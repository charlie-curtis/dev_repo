mysql_service 'foo' do
  port '3306'
  version '5.5'
  initial_root_password 'lolzwat'
  action [:create, :start]
end
