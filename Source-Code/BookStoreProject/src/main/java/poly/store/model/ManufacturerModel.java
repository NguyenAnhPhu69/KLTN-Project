/**
 * @(#)ManufacturerModel.java 2021/09/21.
 * 
 * Copyright(C) 2021 by PHOENIX TEAM.
 * 
 * Last_Update 2021/09/21.
 * Version 1.00.
 */
package poly.store.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Class thong tin truy van cua bang Manufacturer
 * 
 * @author phu-ute
 * @version 1.00
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ManufacturerModel {
	private int id;
	private String name;
	private String banner;
	private String logo;
	private String describe;
}
