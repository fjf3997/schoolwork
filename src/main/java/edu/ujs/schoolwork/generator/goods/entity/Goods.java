package edu.ujs.schoolwork.generator.goods.entity;

import java.time.LocalDateTime;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 商品
 * </p>
 *
 * @author ujs
 * @since 2020-06-30
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class Goods extends Model<Goods> {

    private static final long serialVersionUID = 1L;

    /**
     * 商品名称
     */
    private String name;

    /**
     * 规格
     */
    private String size;

    /**
     * 主条码
     */
    private String barCode;

    /**
     * 生产日期
     */
    private LocalDateTime productDate;

    /**
     * 生产批次
     */
    private Long productNo;

    /**
     * 数量
     */
    private Long count;

    /**
     * 备注
     */
    private String note;


}
