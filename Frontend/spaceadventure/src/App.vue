<template>
  <div id="app">
    <TheHeader></TheHeader>
    <Adventure  ></Adventure>
    <TheFooter></TheFooter>
  </div>
</template>

<script>
import Adventure from './components/AdventureChoices.vue';
import TheHeader from './components/TheHeader.vue';
import TheFooter from  './components/TheFooter.vue';

export default {
  name: 'App',
  components: {
    Adventure,
    TheHeader,
    TheFooter
  }
}
</script>

<style>
#app {
  font-family:Arial, Helvetica, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 0px;
  background-color: black;
  height: 100%;
  width: 100%;
  background-image:url('./assets/spacebackground.jpg');
}
</style>
