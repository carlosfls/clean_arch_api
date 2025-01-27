CREATE TABLE IF NOT EXISTS `TAB_APPOINTMENT` (
    id bigint AUTO_INCREMENT primary key,
    appointment_id varchar(255) not null,
    appointment_date DATE not null,
    user_email varchar(255) not null
);