CREATE TABLE Bilett (
                        id INTEGER AUTO_INCREMENT NOT NULL,
                        name VARCHAR(255) NOT NULL,
                        surname VARCHAR(255) NOT NULL,
                        nrOfTickets INTEGER NOT NULL,
                        phoneNr VARCHAR(100) NOT NULL,
                        email VARCHAR(255) NOT NULL,
                        PRIMARY KEY (id)
);