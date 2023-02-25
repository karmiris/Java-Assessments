new course:
Create new local folder> Run bash in it:
git clone https://github.com/karmiris/Java-Assessments.git 	// perhaps better without token (?)
git config --list
git config --global user.name "me"
git config --global user.email "me@here.com"
git remote -v
git remote add origin2 https://token@github.com/karmiris/Java-Assessments.git 	// if new token created
git push -u origin2 main	
git pull origin2 


git init
(create dummy file, just to create branch and make first submit)
git add .
git commit -m "Test"
git branch -M main
git config --global user.name "me"
git config --global user.email "me@here.com"
git config --list

Create token in github (Settings/Developer Settings/Personal access tokens (classic): choose repo and admin:org rights)

git remote add origin https://token@github.com/karmiris/Java-Assessments.git
git remote -v

git commit -m "Description"
git push -u origin
git pull --all
