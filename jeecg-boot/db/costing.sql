-- BOM成本表
DROP TABLE IF EXISTS `bom_product`;
CREATE TABLE `bom_product`  (
    `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT 'ID',
    PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_bin COMMENT = 'BOM成本表' ROW_FORMAT = DYNAMIC;

-- BOM母件表
DROP TABLE IF EXISTS `bom_master_part`;
CREATE TABLE `bom_master_part`  (
                                `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT 'ID',
                                PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_bin COMMENT = 'BOM母件表' ROW_FORMAT = DYNAMIC;

-- BOM子件表
DROP TABLE IF EXISTS `bom_subassembly_part`;
CREATE TABLE `bom_subassembly_part`  (
                                `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT 'ID',
                                PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_bin COMMENT = 'BOM子件表' ROW_FORMAT = DYNAMIC;
