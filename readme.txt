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


创建远程仓库
创建SSH Key
$ ssh-keygen -t rsa -C "youremail@example.com"
删除远程仓库
$ git remote rm origin
添加远程仓库
$ git remote add origin git@github.com:september3/repository.git
推送至远程仓库
$ git push -u origin master（第一次）
$ git push  origin master

