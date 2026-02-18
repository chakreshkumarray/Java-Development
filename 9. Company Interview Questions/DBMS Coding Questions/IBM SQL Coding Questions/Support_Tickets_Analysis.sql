-- Support Tickets Analysis (SQL) --
-- What it asks: --
-- Calculate the average time it took to resolve tickets, -- 
-- but only for the ones that have actually been resolved (where resolved_at is not NULL). -- 
-- The result should be in hours and formatted to 2 decimal places. --

create database IBM;
use IBM;

SELECT 
    CAST(AVG(TIMESTAMPDIFF(HOUR, created_at, resolved_at)) AS DECIMAL(10,2)) AS average_response_time
FROM 
    support_tickets
WHERE 
    resolved_at IS NOT NULL;