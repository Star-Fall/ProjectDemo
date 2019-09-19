package com.starfall.designpattern.compositepattern.safe;

/**
 * @author StarFall
 * @project ProjectDemo
 * @package com.starfall.designpattern.compositepattern
 * @className Component
 * @date 2019/9/18 18:12
 * @description 抽象构件（Component）——安全组合模式
 */
public interface Component {
	/**
	 * 构件的默认行为：输出结构
	 * 
	 * @param preStr
	 *            前缀
	 */
	public void printStruct(String preStr);
}