CREATE TABLE IF NOT EXISTS user (
    user_id int(5) NOT NULL AUTO_INCREMENT,
    username varchar(50) DEFAULT NULL,
    password varchar(255) NOT NULL,
    avatar varchar(3000) DEFAULT NULL,
    PRIMARY KEY(user_id)
    );
CREATE TABLE IF NOT EXISTS recipe (
	recipe_id int(8) NOT NULL AUTO_INCREMENT,
	title varchar(100) NOT NULL,
	description varchar(1000),
	ingredients varchar(10000),
	methods varchar(10000),
	photos varchar(10000),
	servings int(3) DEFAULT NULL,
	timeToCook varchar(50) DEFAULT NULL,
	loveCount int(5) DEFAULT 0,
	postTime timestamp NOT NULL,
	author_id int(5) NOT NULL,
	PRIMARY KEY(recipe_id),
	FOREIGN KEY(author_id) REFERENCES user(user_id)
	);
CREATE TABLE IF NOT EXISTS feedback (
	feedback_id int(8) NOT NULL AUTO_INCREMENT,
	content varchar(5000) NOT NULL,
	user_id int(5) NOT NULL,
	PRIMARY KEY(feedback_id),
	FOREIGN KEY(user_id) REFERENCES user(user_id)
	);