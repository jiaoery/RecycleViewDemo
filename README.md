# RecycleViewDemo
##RecyclerView的一个学习demo，作者也将从初始的学习到逐渐的更新提升

#1.如何添加RecyclerView的依赖包
* module对应的build.gradle目录下，dependencies下

          dependencies {
             compile fileTree(include: ['*.jar'], dir: 'libs')
             testCompile 'junit:junit:4.12'
             compile 'com.android.support:appcompat-v7:23.4.0'
             compile 'com.android.support:recyclerview-v7:24.1.1'
         }
    
这里直接添加 compile 'com.android.support:recyclerview-v7:24.1.1'（后面版本根据需要更改）

* 在project stucture中add依赖包
    
如图所示<br/>

![](https://github.com/jixiang52002/RecycleViewDemo/blob/master/app/image/add_dependence.png)

#2.初始化 RecyclerView的相关参数
##(1)setLayoutManager(new LinearLayoutManager(this));<br>
       这里使用的setLayoutManager可以设置RecyclerView的每个item的布局，这里用的LinearLayout，提供的还有GridLayoutManager,StaggeredGridLayoutManager(瀑布流)
       
##(2)setAdapter用于设置适配器<br>
     Adapter这里不能使用之前的BaseAdapter,ArrayAdapter,还有SimpleAdapter。这里使用RecycleView中的RecycleView.Adapter.<br>
      *   public abstract VH onCreateViewHolder(ViewGroup parent, int viewType);<br>
           用于创建一个ViewHolder<br>
      *   public abstract void onBindViewHolder(VH holder, int position);<br>
           用于组装view的数据<br>
      *   public int getItemCount();<br>
           需要展示的数据个数<br>
##(3)setItemAnimator 设置RecyclerView删除和添加的动画
##(4)addItemDecoration 为RecyclerView添加分割线
  
#3.效果图展示
* 使用LinearLayout布局的效果<br>
 ![](https://github.com/jixiang52002/RecycleViewDemo/blob/master/app/image/QQ%E5%9B%BE%E7%89%8720160817102259.jpg)

* 使用GridLayoutManager布局的效果<br>
  ![](https://github.com/jixiang52002/RecycleViewDemo/blob/master/app/image/QQ%E5%9B%BE%E7%89%8720160817102317.jpg)

#4.参考文档
  http://www.jcodecraeer.com/a/anzhuokaifa/androidkaifa/2014/1118/2004.html 泡在网上的日子
           

          
          
       
       
