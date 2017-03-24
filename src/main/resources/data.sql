INSERT INTO Occupations (CATEGORY, TITLE) 
	VALUES('Skilled Labor', 'Dino-crane Operator');
INSERT INTO Occupations (CATEGORY, TITLE) 
	VALUES('Management', 'Owner');
INSERT INTO Occupations (CATEGORY, TITLE) 
	VALUES('Homemaker', 'Homemaker');
INSERT INTO Occupations (CATEGORY, TITLE) 
	VALUES('None', 'None');

INSERT INTO Users (USERNAME, FIRST_NAME, LAST_NAME, EMAIL, OCCUPATION_ID) 
	VALUES('fred', 'Fred', 'Flintstone', 'fflintstone@example.com', 1);
INSERT INTO Users (USERNAME, FIRST_NAME, LAST_NAME, EMAIL, OCCUPATION_ID) 
	VALUES('wilma', 'Wilma', 'Flintstone', 'wflintstone@example.com', 3);
INSERT INTO Users (USERNAME, FIRST_NAME, LAST_NAME, EMAIL, OCCUPATION_ID)
	VALUES('barney', 'Barney', 'Rubble', 'brubble@example.com', 1);
INSERT INTO Users (USERNAME, FIRST_NAME, LAST_NAME, EMAIL, OCCUPATION_ID)
	VALUES('betty', 'Betty', 'Rubble', 'brubble2@example.com', 3);
