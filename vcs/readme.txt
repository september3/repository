git  use
��ʼ��һ���汾��
$mkdir repository
$cd repssitory
$pwd
���汾���Ϊgit�ɹ���Ŀ�
$git init
�ύ---�ļ��ύ���ݴ���
$git add readme.txt
$git commit -m "wrote a readme file"---�ύ����ǰ��֧/���زֿ�
�鿴״̬
$git status

�鿴��ͬ
$git diff(difference)

�汾����(�м���^�ʹ�����˼����汾)
$git reset --hard HEAD^^^^

�鿴�ύ��ʷ
$git log

���ύ��ʷ�����Ϣ
$git log  --pretty=oneline

�鿴������ʷ
$git reflog

�鿴�������Ͱ汾���������°汾������
git diff HEAD -- readme.txt

readme.txt�ļ��ڹ��������޸�ȫ������
$ git checkout -- readme.txt

�汾����ɾ���ļ�
$git rm readm.txt
�ָ�
$git checkout --readme.txt


����SSH Key
$ ssh-keygen -t rsa -C "youremail@example.com"
ɾ��Զ�ֿ̲�
$ git remote rm origin
���Զ�ֿ̲�
$ git remote add origin git@github.com:september3/repository.git
������Զ�ֿ̲�
$ git push -u origin master����һ�Σ�
$ git push  origin master

�鿴Զ�ֿ̲�
$git remote
��ʾ��Ϊ��ϸ����Ϣ
$git remote -v


��¡Զ�˲ֿ������زֿ�
$ git clone git@github.com:michaelliao/gitskills.git

����dev��֧��Ȼ���л���dev��֧
$ git checkout -b dev
�൱��
$ git branch dev
$ git checkout dev
�鿴��ǰ��֧
$git branch
�л���master
$git checkout master

dev��֧�ϲ���master��֧��
$git merge dev
�ϲ���ɣ�ɾ��dev��֧
$ git branch -d dev
���ͷ�֧
$git push origin dev	
�鿴��֧�ϲ�ͼ
git log --graph

Զ��ץȡ��֧
$git pull

rebase�������԰ѱ���δpush�ķֲ��ύ��ʷ�����ֱ��
$git rebase

�ݴ浱ǰ������
$git stash  
�ָ�stash�����ݣ����ǲ�ɾ��
$git stash apply
stash���ݻָ��Ժ����ɾ��
$git stash drop
stash���ݻָ���ͬʱɾ��
$git stash pop
�鿴stash������
$git stash list

����û�б��ϲ����ķ�֧����ǿ��ɾ��
$git branch -D name  


������ǩ
�л�����Ҫ���ǩ�ķ�֧��
$ git tag v1.0������
�鿴��ǩ
$git tag

����git push origin <tagname>��������һ�����ر�ǩ��

����git push origin --tags��������ȫ��δ���͹��ı��ر�ǩ��

����git tag -d <tagname>����ɾ��һ�����ر�ǩ��

����git push origin :refs/tags/<tagname>����ɾ��һ��Զ�̱�ǩ��
