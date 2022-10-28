create table tb_layer_one(
layer_one_id varchar(10) not null,
layer_one_name varchar(150) not null,
layer_one_other_content varchar(150),
primary key (layer_one_id)
);
create table tb_layer_two(
layer_two_id varchar(10) not null,
layer_two_name varchar(150) not null,
layer_two_other_content varchar(150),
primary key (layer_two_id)
);
create table tb_layer_three(
layer_three_id varchar(10) not null,
layer_three_name varchar(150) not null,
layer_three_other_content varchar(150),
primary key (layer_three_id)
);
create table tb_one_rel_two(
	layer_one_id varchar(10) not null,
	layer_two_id varchar(10) not null,
	status varchar(3) not null,
	primary key (layer_one_id,layer_two_id)
);
create table tb_two_rel_three(
	layer_two_id varchar(10) not null,
	layer_three_id varchar(10) not null,
	status varchar(3) not null,
	primary key (layer_two_id,layer_three_id)
)