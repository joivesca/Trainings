--Sample application with this article uses Apache Derby.
--This script can be used to create a "defect" table and insert some sample data.

DROP TABLE "defect"



CREATE TABLE "defect"
(
   id BIGINT NOT NULL GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1) PRIMARY KEY,
   description VARCHAR(200),
   priority SMALLINT,
   is_resolved SMALLINT,
   resolution VARCHAR(200),
   submitted_by VARCHAR(100),
   submitted_on TIMESTAMP,
   resolved_by VARCHAR(100),
   resolved_on TIMESTAMP
);


--Sample data:

insert into "defect"(description,priority,is_resolved,submitted_on,submitted_by)
   values('After login, all I see is a blank screen!',1,0,'2007-10-10 13:12:12','Smith,John');

insert into "defect"(description,priority,is_resolved,submitted_on,submitted_by)
   values('Another defect.',4,0,'2007-10-12 15:10:00','Smith,John');