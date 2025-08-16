-- V3__create_table_topicos_resposta.sql
CREATE TABLE topicos_resposta (
    topicos_id BIGINT NOT NULL,
    resposta VARCHAR(255),
    CONSTRAINT fk_topico_resposta FOREIGN KEY (topicos_id)
        REFERENCES topicos(id)
        ON DELETE CASCADE
);
