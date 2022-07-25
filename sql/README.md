SQL:
SQL us a standart language for accessing and manipulating databases.

DATABASES:

Databases run on their  own severs so the part numbers will be different, its whole purpose is so hold onto data.
If the database sever gets turned off/on, the data will still be there APPLICATION (fll stack application, full stack is whenever you do all part the application)
Backend apps ALWAYS need a database.
an application is anything that runs code is an application(ui,backend , database).
PROVIDERS: companies that provides you database:
*Amazon
*IBM
*Oracle

many different relational database management system:
AKA DATABASE TYPE
* i.e what database are using:
* postqres
* msql
* mongoDB
* sqLITE
* mariaDB
All these databases use a language <basically>  the same sql.
* if you know how to write sql,you can write in any of these these through they may differ slightly or hva more/less features


-Terminal Commands:
```bash
brew services #allows us to see files within our postgresql
brew services start postgresql #the sever starts running.
brew services stop postgresql # stop running the sever.
psql #lets us write in different lanquage
createdb "owner"# make database, in this case "owner"(needs to be the name of the account.)
```

-SQL Commands:
```sql
-- specifically in the postgress shell
(\l) --> gives us a list of database.(backlash is specifically SQL!!)
(\q) --> quits postgress and takes us back bash.
(\du) --> show all users.
(\c) --> changes which database we are in.
(\dt) --> show all tables.
(\d+ table_Name) --> show constraints of the table.
-- EVERYTHING above is SPECIFICALLY to postgres--
CREATE DATABASE insertname; (NEEDS THE SEMICOLON)
-- cntrl C can cancel a line of code
DROP DATABASE insertname --deletes database, (NEEDS SEMICOLON) if you drop(DELETE) you wont be able to recover it.
CREATE TABLE person (first_name  VA NOT NULL, last_name varchar(255) NOT NULL, age integer NOT NULL, is_happy bool);
SELECT * FROM insertname; --> how we see inside the table
INSERT INTO  name (field names) VALUES (actual data) --> add rows in the table
How to create multiples rows:(https://www.sqlservertutorial.net/sql-server-basics/sql-server-insert-multiple-rows/)
-----DELETE A TABLE-----
DELETE FROM table_Name WHERE your condition (delete a row)
DELETE FROM table_Name(delete all row BUT not the table)
ALTER TABLE table_Name DROP COLUMN column_Name(delete a column)
ALTER TABLE "order" ADD CONSTRAINT order_appetizer_fk FOREING KEY (appetizer) REFERENCES appetizer(id);

```
- Todo: figure out how to get an appetizer and entree by id (/)
- Todo: create two tables for order(entree and appetizers) ( )


