基于Jyaml和velocity的markdown文档生成工具
======
将markdown以一定的规范解析成静态资源。

# 约定
## 文件名的规范
文件名如：2014-01-19-helloworld.md

则生成的文件存放路径：2014/01/19/helloworld.html

## 文件夹目录结构
    webapp
       |-- _doc 生成的静态文档路径
       |-- _include 自定义扩展存放的路径。如主题。
                |-- themes 主题存放目录
       |-- _layout  布局文件存放路径

# 未完待续
