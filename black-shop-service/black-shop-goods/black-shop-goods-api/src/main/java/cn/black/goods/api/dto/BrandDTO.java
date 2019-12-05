/**
 * <p>Company: www.black-shop.cn</p>
 *
 * <p>Copyright: Copyright (c) 2018-2050</p>
 * <p>
 * black-shop(黑店) 版权所有,并保留所有权利。
 */

package cn.black.goods.api.dto;


import lombok.Data;

import java.util.Date;

@Data
public class BrandDTO {

	/**
	 * 主键id
	 */
	private Long id;

	/**
	 * 品牌名字
	 */
	private String brandName;

	/**
	 * 品牌图片路径
	 */
	private String brandPic;

	/**
	 * 品牌备注
	 */
	private String remark;

	/**
	 * 品牌状态
	 */
	private Integer status;

	/**
	 * 创建时间
	 */
	private Date createDate;
}
