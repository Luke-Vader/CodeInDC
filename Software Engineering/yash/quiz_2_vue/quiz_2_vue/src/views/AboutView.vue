<template>
  <div id="container">
    <div id="type">
      <input type="text" v-model="activityType" placeholder="Type" />
      <button @click="getActivity">Fetch</button>
    </div>
    
  </div>
</template>

<script>
export default {
  data() {
    return {
      activityType: "",
    };
  },
};
</script>

<style>
#container {
  display: flex;
  justify-content: center;
  align-items: center;
  height: 100vh;
}
#id {
  margin-right: 10px;
}

</style>
