<template>
    <v-app class="background">
        <div style="margin-top: 30px">
            <v-layout justify-center>
                <v-card width="1200" style="margin-top: 30px">
                    <div style="margin-top: 10px; margin-left: 10px; margin-right: 10px">
                    <p style="font-family:verdana; font-size: 25px">Herzlich Willkommen zum Workshop Serverseitige Entwicklung mit Ktor, im Rahmen des Moduls Web Technologien, im Medieninformatik Master an der Technischen Hochschule Köln</p>
                    <p style="font-family:verdana; font-size: 17px">Über das Menü kann auf die Aufgaben 1 - 3 zugegriffen werden. Aufgabe 4 ist optional und wird während des Workshops angekündigt. Über den Reiter Home oder durch das aktuallisieren der seite können Sie jederzeit wieder auf diese Seite zurückkommen</p>
                    <p style="font-family:verdana; font-size: 17px">Sollten Problemen oder Fragen, stehe ich jederzeit zur Verfügung</p>
                        <p v-if="backendOnline === true" style="font-family:verdana; font-size: 17px; color: green"> Backend: Online</p>
                        <p v-if="backendOnline === false" style="font-family:verdana; font-size: 17px; color: red"> Backend: Offline!</p>
                    </div>
                </v-card>
            </v-layout>
        </div>
    </v-app>
</template>

<script>
    import axios from 'axios';

    export default {
        name: "welcome",
        data() {
            return {
                backendOnline: false
            };
        },
        mounted() {
            this.checkBackend();
        },
        methods: {
            checkBackend() {
                axios.get(
                    'http://localhost:3000/checkStatus/'
                ).then(res => {
                    if(res.status === 200){
                        this.backendOnline = true;
                    }
                });
            }
        }
    }
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