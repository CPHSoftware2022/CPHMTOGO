INSERT INTO customerOrder
(order_start, order_end, total_price, accepted, canceled_reason, delivered, customer_id, resturant_id, feedback_id, employee_id)
VALUES
('2022-10-10 10:10:10', '2022-10-10 10:20:10', 400, 1, NULL, 1, 1, 1, 1, 2);

INSERT INTO customerOrder
(order_start, order_end, total_price, accepted, canceled_reason, delivered, customer_id, resturant_id, feedback_id, employee_id)
VALUES
('2022-10-10 10:30:10', '2022-10-10 10:40:10', 500, 0, 'Not enough chicken', 0, 2, 1, NULL, NULL);

INSERT INTO customerOrder
(order_start, order_end, total_price, accepted, canceled_reason, delivered, customer_id, resturant_id, feedback_id, employee_id)
VALUES
('2022-10-10 11:10:10', '2022-10-10 11:20:10', 4000, 1, NULL, 0, 3, 2, null, 2);