create table systemuser (
    id BIGINT not NULL auto_increment,
  username varchar(25) not null,
  password varchar(15) not null,
  primary key (username),
  UNIQUE KEY username(username),
  UNIQUE KEY id_num(id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

create table roles (
    id BIGINT NOT NULL AUTO_INCREMENT,
    role_name varchar(50) not null ,
    primary key (role_name),
    UNIQUE KEY role_name_unique(role_name),
    UNIQUE KEY id_num(id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

insert into roles(role_name) values ('PARENT');
insert into roles(role_name) values('SON');

create table users_roles (
    id BIGINT not NULL AUTO_INCREMENT,
    username varchar(25) not null,
    role varchar(50) not null,
    primary key (id),
    foreign key (username) references systemuser(username),
    foreign key (role) references roles(role_name),
    constraint user_role unique (username,role)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

