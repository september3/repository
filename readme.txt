git  use
初始化一个版本库
$mkdir repository
$cd repssitory
$pwd
将版本库变为git可管理的库
$git init
提交
$git add readme.txt
$git commit -m "wrote a readme file"
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


