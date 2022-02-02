#install docker
sudo apt -y install apt-transport-https ca-certificates curl software-properties-common
sudo apt-get install -y docker.io
sudo groupadd docker
sudo usermod -aG docker $USER

cd $HOME
wget https://codeload.github.com/IlyesBenighil/LabtainersPFE/zip/refs/heads/master
unzip master
mv LabtainersPFE-master labtainer
chmod 777 labtainer
cd labtainer
./install-labtainer.sh