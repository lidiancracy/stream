### Stream

> 开始操作 stream()
> 中间操作

- filter 过滤
- distinct 去重
- sorted 排序
- map 替身(传进去的流是对象流,可以通过map转换成对象中的某个属性流)
- sorted 排序
- limit 限制(可以配合sort使用,取前面几个)
- skip 跳过(与limit相反,跳过前几个)
> 终结操作

- foreach

---
> 开始操作

- 单列集合 list set .stream()
- 双列集合 map .entryset().stream()   先转换成单列操作

> 去重操作

配合 lombok的@EqualsAndHashCode
不加默认比对象地址

P23
