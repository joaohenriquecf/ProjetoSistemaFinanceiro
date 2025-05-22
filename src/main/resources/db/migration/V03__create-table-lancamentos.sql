CREATE TABLE lancamentos(
    id bigint not null auto_increment,
    tipo_lancamento enum('RECEITA', 'DESPESA') not null,
    descricao varchar(100) not null,
    data_vencimento date not null,
    data_pagamento date,
    valor decimal(10,2) not null,
    observacao varchar(100),
    ativo tinyint default 1,
    id_categoria bigint(20) not null,
    id_pessoa bigint(20) not null,
    primary key(id),
    foreign key(id_categoria) references categorias(id),
    foreign key(id_pessoa) references pessoas(id)
);