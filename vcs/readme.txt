git  use
初始化一个版本库
$mkdir repository
$cd repssitory
$pwd
将版本库变为git可管理的库
$git init
提交---文件提交到暂存区
$git add readme.txt
$git commit -m "wrote a readme file"---提交到当前分支/本地仓库
查看状态
$git status

查看不同
$git diff(difference)

版本回退(有几个^就代表回退几个版本)
$git reset --hard HEAD^^^^

查看提交历史
$git log

简化提交历史输出信息
$git log  --pretty=oneline

查看命令历史
$git reflog

查看工作区和版本库里面最新版本的区别
git diff HEAD -- readme.txt

readme.txt文件在工作区的修改全部撤销
$ git checkout -- readme.txt

版本库中删除文件
$git rm readm.txt
恢复
$git checkout --readme.txt


创建SSH Key
$ ssh-keygen -t rsa -C "youremail@example.com"
删除远程仓库
$ git remote rm origin
添加远程仓库
$ git remote add origin git@github.com:september3/repository.git
推送至远程仓库
$ git push -u origin master（第一次）
$ git push  origin master

查看远程仓库
$git remote
显示更为详细的信息
$git remote -v


克隆远端仓库至本地仓库
$ git clone git@github.com:michaelliao/gitskills.git

创建dev分支，然后切换到dev分支
$ git checkout -b dev
相当于
$ git branch dev
$ git checkout dev
查看当前分支
$git branch
切换回master
$git checkout master

dev分支合并到master分支上
$git merge dev
合并完成，删除dev分支
$ git branch -d dev
推送分支
$git push origin dev	
查看分支合并图
git log --graph

远程抓取分支
$git pull

rebase操作可以把本地未push的分叉提交历史整理成直线
$git rebase

暂存当前工作区
$git stash  
恢复stash的内容，但是不删除
$git stash apply
stash内容恢复以后进行删除
$git stash drop
stash内容恢复的同时删除
$git stash pop
查看stash的内容
$git stash list

丢弃没有被合并过的分支进行强行删除
$git branch -D name  


创建标签
切换到需要打标签的分支上
$ git tag v1.0，即可
查看标签
$git tag

命令git push origin <tagname>可以推送一个本地标签；

命令git push origin --tags可以推送全部未推送过的本地标签；

命令git tag -d <tagname>可以删除一个本地标签；

命令git push origin :refs/tags/<tagname>可以删除一个远程标签。
