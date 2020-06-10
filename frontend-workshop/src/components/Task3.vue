<template>
    <v-app>
        <v-btn icon @click="getRawHtml" color="red" style="float: right; margin-top: 30px; margin-left: 30px">
            <v-icon>mdi-restart</v-icon>
        </v-btn>
        <div style="margin-top: 50px" v-html="rawHtml">
        </div>
    </v-app>
</template>

<script>
    import axios from 'axios';

    export default {
        name: 'task3',
        data() {
            return {
                rawHtml: ``
            };
        },
        methods: {
            getRawHtml() {
                axios.get(
                    'http://localhost:3000/raw/'
                ).then(res => {
                    this.rawHtml = res.data;
                });
            }
        }
    };
</script>

<style scoped>

</style>