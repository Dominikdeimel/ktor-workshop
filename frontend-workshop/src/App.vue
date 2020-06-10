<template>
    <div id="app">
        <div style="height: 1px">
            <bar @newComponent="changeActiveComponent"></bar>
        </div>
        <div style="margin-top: 60px; height: auto">
            <welcome v-if="activeComponent === 'welcome'"></welcome>
            <task1 v-if="activeComponent === 'task1'"></task1>
            <task2 v-if="activeComponent === 'task2'"></task2>
            <task3 v-if="activeComponent === 'task3'"></task3>
            <task4Optional v-if="activeComponent === 'task4Optional'"></task4Optional>

        </div>
    </div>
</template>

<script>

    import bar from './components/Bar';
    import task1 from './components/Task1'
    import task2 from './components/Task2'
    import task3 from './components/Task3'
    import task4Optional from './components/Task4Optional'
    import welcome from "./components/Welcome";

    export default {
        name: 'App',
        components: {
            welcome,
            bar,
            task1,
            task2,
            task3,
            task4Optional
        },
        data() {
            return {
                activeComponent: 'welcome'
            };
        },
        methods: {
            changeActiveComponent(value) {
                this.activeComponent = value;
            }
        }
    };
</script>

<style>
    #app {
        font-family: Avenir, Helvetica, Arial, sans-serif;
        -webkit-font-smoothing: antialiased;
        -moz-osx-font-smoothing: grayscale;
        text-align: center;
        color: #2c3e50;
        margin-top: 0px;
    }
</style>