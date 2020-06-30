CREATE TABLE IF NOT EXISTS `goods` (
  `id` bigint(20) NOT NULL auto_increment COMMENT '主键',
  `name` varchar(32)  NOT NULL COMMENT '商品名称',
  `size` varchar(32)  DEFAULT NULL COMMENT '规格',
  `bar_code` varchar(2000) DEFAULT NULL COMMENT '主条码',
  `product_date` datetime DEFAULT NULL COMMENT '生产日期',
  `product_no` bigint(20)  DEFAULT NULL COMMENT '生产批次',
  `count` bigint(20) DEFAULT NULL COMMENT '数量',
  `note` varchar(2000)  DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin ROW_FORMAT=DYNAMIC COMMENT='商品';
