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
  * setLayoutManager(new LinearLayoutManager(this));<br>
       这里使用的setLayoutManager可以设置RecyclerView的每个item的布局这里用的LinearLayout
       
       
  * setAdapter用于设置适配器<br>
     Adapter这里不能使用之前的BaseAdapter,ArrayAdapter,还有SimpleAdapter。这里使用RecycleView中的RecycleView.Adapter.<br>
      * ublic abstract VH onCreateViewHolder(ViewGroup parent, int viewType);<br>
           用于创建一个ViewHolder<br>
      * public abstract void onBindViewHolder(VH holder, int position);<br>
           用于组装view的数据<br>
      * public int getItemCount();<br>
           需要展示的数据个数<br>
           

          
          
       
       
