package com.starfall.designpattern.compositepattern.transparent;

import java.util.ArrayList;
import java.util.List;

/**
 * @author StarFall
 * @project ProjectDemo
 * @package com.starfall.designpattern.compositepattern.transparent
 * @className Composite
 * @date 2019/9/19 11:07
 * @description 容器构件（Composite）——透明组合模式
 */
public class Composite extends Component {
	/**
	 * 用来存储组合对象中包含的子组件对象
	 */
	private List<Component> childComponents = new ArrayList<Component>();
	/**
	 * 组合对象的名字
	 */
	private String name;

	/**
	 * 构造方法，传入组合对象的名字
	 *
	 * @param name
	 *            组合对象的名字
	 */
	public Composite(String name) {
		this.name = name;
	}

	/**
	 * 重写聚集管理方法，增加一个子构件对象
	 *
	 * @param child
	 *            子构件对象
	 */
	@Override
	public void addChild(Component child) {
		childComponents.add(child);
	}

	/**
	 * 重写聚集管理方法，删除一个子构件对象
	 *
	 * @param index
	 *            子构件对象的下标
	 */
	@Override
	public void removeChild(int index) {
		childComponents.remove(index);
	}

	/**
	 * 重写聚集管理方法，返回所有子构件对象
	 */
	@Override
	public List<Component> getChild() {
		return childComponents;
	}

	/**
	 * 重写输出对象的自身结构
	 *
	 * @param preStr
	 *            前缀，主要是按照层级拼接空格，实现向后缩进
	 */
	@Override
	public void printStruct(String preStr) {
		// 先把自己输出
		System.out.println(preStr + "+" + this.name);
		// 如果还包含有子组件，那么就输出这些子组件对象
		if (this.childComponents != null) {
			// 向后缩进
			preStr += "\t";
			// 输出当前对象的子对象
			for (Component c : childComponents) {
				// 递归输出每个子对象
				c.printStruct(preStr);
			}
		}
	}
}