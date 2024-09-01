-- 产品表
DROP TABLE IF EXISTS `t_product`;
CREATE TABLE `t_product`  (
    `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT 'ID',
    PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_bin COMMENT = '产品表' ROW_FORMAT = DYNAMIC;

-- 产品属性表
DROP TABLE IF EXISTS `t_product_attr`;
CREATE TABLE `t_product_attr`  (
                                `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT 'ID',
                                PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_bin COMMENT = '产品属性表' ROW_FORMAT = DYNAMIC;

-- 产品规格表
DROP TABLE IF EXISTS `t_product_sku`;
CREATE TABLE `t_product_sku`  (
                                `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT 'ID',
                                PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_bin COMMENT = '产品规格表' ROW_FORMAT = DYNAMIC;

-- 产品分类表
DROP TABLE IF EXISTS `t_product_category`;
CREATE TABLE `t_product_category`  (
                                  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT 'ID',
                                  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_bin COMMENT = '产品分类表' ROW_FORMAT = DYNAMIC;

-- 产品单位表
DROP TABLE IF EXISTS `t_product_unit`;
CREATE TABLE `t_product_unit`  (
                                       `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT 'ID',
                                       PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_bin COMMENT = '产品单位表' ROW_FORMAT = DYNAMIC;

-- 物料表
DROP TABLE IF EXISTS `t_material`;
CREATE TABLE `t_material`  (
                                   `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT 'ID',
                                   PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_bin COMMENT = '物料表' ROW_FORMAT = DYNAMIC;
