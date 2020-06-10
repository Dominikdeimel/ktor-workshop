<template>
    <v-app class="background">
        <div style="margin-top: 30px">
            <v-layout justify-center>
                <v-card width="1200" style="margin-top: 30px">
                    <h1 style="margin-top: 20px">Aufgabe 2</h1>
                    <v-btn icon @click="resetImages" color="red" style="float: right; margin-top: -40px; margin-right: 20px">
                        <v-icon>mdi-restart</v-icon>
                    </v-btn>
                    <v-row class="mx-2">
                        <v-col v-for="image in allImages" :key="image" cols="3" class="px-1">
                            <v-card @click="openDialog(image)">
                                <h3>{{image.imageName}}</h3>
                                <v-img :src="getImagePath(image.imagePath)" width="300" contain></v-img>
                            </v-card>
                        </v-col>
                    </v-row>
                </v-card>
            </v-layout>
            <v-dialog v-model="dialog" width="800" persistent>
                <v-layout justify-center>
                    <v-card width="800" height="auto">
                        <h3>{{selectedImage.imageName}}</h3>
                        <div align="center">
                            <v-img :src="getImagePath(selectedImage.imagePath)" width="350" contain></v-img>
                        </div>
                            <v-row>
                                <v-col>
                                <v-text-field
                                        v-model="newImageName"
                                        color="deep-purple accent-4"
                                        :label="selectedImage.imageName"
                                        outlined
                                        style="width: 200px; margin-left: 70px"
                                ></v-text-field>
                                </v-col>
                                <v-col>
                                <v-btn color="green darken-1" text @click="changeImageName" style="float: left; margin-left: -120px; margin-top: 10px">
                                    Change Name
                                </v-btn>
                                    <v-col>
                                </v-col>
                                <v-btn color="red" text @click="closeDialog" style="float: right; margin-right: 70px; margin-top: -15px">
                                    Close
                                </v-btn>
                                </v-col>
                            </v-row>
                    </v-card>
                </v-layout>
            </v-dialog>
        </div>
    </v-app>
</template>

<script>
    import axios from 'axios';

    export default {
        name: 'task2',
        data() {
            return {
                allImages: [],
                selectedImage: {},
                dialog: false,
                newImageName: ''
            };
        },
        mounted() {
            this.getAllImages();
        },
        methods: {
            changeImageName() {
                axios.post(
                    'http://localhost:3000/image/',
                    {
                        imageId: this.selectedImage.imageId,
                        newImageName: this.newImageName + '.jpg'
                    }
                ).then(res => {
                    this.allImages = res.data;
                    this.closeDialog()
                });
            },
            getAllImages() {
                axios.get(
                    'http://localhost:3000/image/',
                    {
                        params: {
                            search_param: this.search_param
                        }
                    }
                ).then(res => {
                    this.allImages = res.data;
                });
            },
            resetImages(){
                axios.delete('http://localhost:3000/image/reset'
                ).then( res => {
                        console.log(res);
                    }
                )
            },
            openDialog(image) {
                this.selectedImage = image
                this.dialog = true;
            },
            closeDialog() {
                this.dialog = false;
            },
            getImagePath(originalPath) {
                return `http://localhost:3000/${originalPath}`;
            }
        }
    };
</script>

<style scoped>
    .background {
        background-image: url('../assets/pattern1sj5r.jpg');
        height: auto;
        background-position: center;
        background-repeat: repeat;
        position: relative;
    }

</style>