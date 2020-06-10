<template>
    <v-app id="inspire" class="background">
        <div style="margin-top: 30px">
            <v-layout justify-center>
                <v-card width="500" height="auto">
                    <h1 style="margin-top: 10px">Aufgabe 1</h1>
                    <div style="margin-top: 20px">
                        <v-row no-gutters>
                            <v-col>
                                <v-text-field
                                        v-model="search_param"
                                        color="deep-purple accent-4"
                                        label="Suche"
                                        outlined
                                        style="width: 300px;  margin-left: 60px"
                                ></v-text-field>
                            </v-col>
                            <v-col>
                                <v-btn icon @click="getAllImages"
                                       style="margin-top: 10px">
                                    <v-icon>mdi-magnify</v-icon>
                                </v-btn>
                            </v-col>
                        </v-row>
                    </div>
                </v-card>
            </v-layout>
            <v-layout justify-center>
                <v-card width="1200" height="auto" style="margin-top: 30px">
                    <v-row class="mx-2">
                        <v-col v-for="image in allImages" :key="image.name" cols="3" class="px-1">
                            <v-card>
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
        name: 'task1',
        data() {
            return {
                allImages: [],
                search_param: ''
            };
        },
        mounted() {
            this.getAllImages();
        },
        methods: {
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