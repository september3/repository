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


����Զ�ֿ̲�
����SSH Key
$ ssh-keygen -t rsa -C "youremail@example.com"
ɾ��Զ�ֿ̲�
$ git remote rm origin
���Զ�ֿ̲�
$ git remote add origin git@github.com:september3/repository.git
������Զ�ֿ̲�
$ git push -u origin master����һ�Σ�
$ git push  origin master

