drop table if exists car;

CREATE table car(
	id 	BIGINT SERIAL  	NOT NULL,
	make 	VARCHAR(255) 	NOT NULL,
	model 	VARCHAR(255)	NOT NULL,
	year	int		NOT NULL
);