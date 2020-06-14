<template>
    <v-app class="background">
        <div style="margin-top: 30px">
            <v-layout justify-center>
                <v-card width="1200" style="margin-top: 30px">
                    <h1 style="margin-top: 20px">Aufgabe 4 (Optional)</h1>
                    <v-btn icon @click="resetImages" color="red" style="float: right; margin-top: -40px; margin-right: 20px">
                        <v-icon>mdi-restart</v-icon>
                    </v-btn>
                    <v-row class="mx-2">
                        <v-col v-for="image in allImages" :key="image.imageId" cols="3" class="px-1">
                            <v-card @click="deleteImage(image.imageId)">
                                <h3>{{image.imageName}}</h3>
                                <v-img :src="getImagePath(image.imagePath)" width="300" contain></v-img>
                            </v-card>
                        </v-col>
                    </v-row>
                </v-card>
            </v-layout>
        </div>
    </v-app>
</template>

<script>
    import axios from 'axios';

    export default {
        name: 'task4Optional',
        data() {
            return {
                allImages: []
            };
        },
        mounted() {
            this.getAllImages();
        },
        methods: {
            deleteImage(imageId) {
                axios.delete(
                    'http://localhost:3000/image/',
                    {
                        params : {
                            imageId: imageId
                        }
                    }
                ).then(res => {
                    console.log(res)
                    this.getAllImages()
                });
            },
            getAllImages() {
                axios.get(
                    'http://localhost:3000/image/all/',
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
                        this.getAllImages()
                    }
                )
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