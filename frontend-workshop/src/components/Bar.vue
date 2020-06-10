<template>
    <div id="app">
        <v-app id="inspire">
            <div>
                <v-app-bar color="grey accent-4 gradient" dark src="https://picsum.photos/1920/1080?random" absolute>
                    <v-app-bar-nav-icon @click="drawer = true"></v-app-bar-nav-icon>
                    <v-toolbar-title>Workshop Serverseitige Entwicklung mit Ktor</v-toolbar-title>
                </v-app-bar>
                <v-navigation-drawer v-model="drawer" absolute temporary>
                    <v-list nav dense>
                        <v-list-item-group active-class="deep-purple--text text--accent-4">
                            <v-list-item @click="changeActiveComponent('welcome')">
                                <v-list-item-icon>
                                    <v-icon>mdi-home</v-icon>
                                </v-list-item-icon>
                                <v-list-item-title>Home</v-list-item-title>
                            </v-list-item>
                            <v-list-item @click="changeActiveComponent('task1')">
                                <v-list-item-icon>
                                    <v-icon>mdi-puzzle-heart</v-icon>
                                </v-list-item-icon>
                                <v-list-item-title>Aufgabe 1</v-list-item-title>
                            </v-list-item>
                            <v-list-item @click="changeActiveComponent('task2')">
                                <v-list-item-icon>
                                    <v-icon>mdi-puzzle-heart</v-icon>
                                </v-list-item-icon>
                                <v-list-item-title>Aufgabe 2</v-list-item-title>
                            </v-list-item>
                            <v-list-item @click="changeActiveComponent('task3')">
                                <v-list-item-icon>
                                    <v-icon>mdi-puzzle-heart</v-icon>
                                </v-list-item-icon>
                                <v-list-item-title>Aufgabe 3</v-list-item-title>
                            </v-list-item>
                            <v-list-item @click="changeActiveComponent('task4Optional')">
                                <v-list-item-icon>
                                    <v-icon>mdi-puzzle-heart-outline</v-icon>
                                </v-list-item-icon>
                                <v-list-item-title>Aufgabe 4 (Optional)</v-list-item-title>
                            </v-list-item>
                        </v-list-item-group>
                    </v-list>
                </v-navigation-drawer>


            </div>
        </v-app>
    </div>

</template>

<script>
    export default {
        name: 'Bar',
        data(){
            return {
                drawer: false
            };
        },
        methods: {
            changeActiveComponent(newComponent){
                this.$emit('newComponent', newComponent);
            }
        }
    };
</script>

<style scoped>
</style>